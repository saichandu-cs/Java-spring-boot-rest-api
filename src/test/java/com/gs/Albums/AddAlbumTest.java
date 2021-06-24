package com.gs.Albums;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gs.Albums.controllers.AlbumController;
import com.gs.Albums.models.Albums;
import com.gs.Albums.services.AlbumService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;



@RunWith(SpringRunner.class)
public class AddAlbumTest {
        private MockMvc mockMvc;

        private ObjectMapper objectMapper = new ObjectMapper();

        @InjectMocks
        private AlbumController albumController;

        @Mock
        private AlbumService albumService;

        private Albums album;

        @Before
        public void setup(){
            album = new Albums();
            album.setId(222L);
            album.setTitle("ffefefe");
            album.setUserId(32423L);

            when(albumService.addAlbum(any())).thenReturn(album);

            mockMvc = MockMvcBuilders.standaloneSetup(albumController).build();
        }

        @Test
        public void testAddOffer() throws Exception {

            String input = "{\n"+
                    "\"id\": 22,\n"+
                    "\"userId\":23,\n"+
                    "\"title\":\"sdfhfv\" \n"+
                    "}";
            mockMvc.perform(post("/albums")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(input))
                    .andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());
        }



    }
