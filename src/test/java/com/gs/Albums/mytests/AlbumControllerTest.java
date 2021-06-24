//package com.gs.Albums.mytests;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.gs.Albums.models.Albums;
//import com.gs.Albums.repository.AlbumRepository;
//import com.gs.Albums.services.AlbumService;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import static org.mockito.ArgumentMatchers.eq;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//@WebMvcTest
//public class AlbumControllerTest {
//    @MockBean
//    AlbumRepository albumRepository;
//
//    @InjectMocks
//    AlbumService albumService;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private static final ObjectMapper mapper1 = new ObjectMapper();
//
//
//    @Test
//    public void testAddAlbum() throws Exception
//    {
//        Albums album=new Albums();
//        album.setUserId(2L);
//        album.setTitle("fewfe");
//        album.setId(3L);
//        Mockito.when(albumRepository.save(album)).thenReturn(album);
//
//        Mockito.when(albumService.addAlbum(eq(album))).thenReturn(album);
//
//        String json1=mapper1.writeValueAsString(album);
//
//
//        MvcResult requestResult=mockMvc.perform(post("/albums")
//                .contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
//                .content(json1).accept(MediaType.APPLICATION_JSON)).andReturn();
//
//        String result=requestResult.getResponse().getContentAsString();
//
//        Albums alb=new ObjectMapper().readValue(result,Albums.class);
//        assertEquals(1,alb.getId());
//    }
//
//}