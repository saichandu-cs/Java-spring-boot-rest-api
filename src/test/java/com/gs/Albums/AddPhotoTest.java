//package com.gs.Albums;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.gs.Albums.controllers.AlbumController;
//import com.gs.Albums.controllers.PhotosController;
//import com.gs.Albums.models.Albums;
//import com.gs.Albums.models.Photos;
//import com.gs.Albums.repository.PhotosRepository;
//import com.gs.Albums.services.AlbumService;
//import com.gs.Albums.services.PhotoService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//
//
//
//@RunWith(SpringRunner.class)
//public class AddPhotoTest {
//    private MockMvc mockMvc;
//
//    private ObjectMapper objectMapper = new ObjectMapper();
//
//    @InjectMocks
//    private PhotosController photosController;
//
//    @Mock
//    private PhotosRepository photosRepository;
//
//    @Mock
//    private PhotoService photoService;
//
//    private Photos photo;
//
//    @Before
//    public void setup(){
//        photo  = new Photos();
//        photo.setId(222L);
//        photo.setTitle("ffefefe");
//        photo.setThumbnailUrl("bejfhrbfhevg");
//        photo.setAlbumId(2L);
//        photo.setUrl("ergregbrkgr");
//        when(photosRepository.save(photo)).thenReturn(photo);
//
//        when(photoService.AddPhoto(ArgumentMatchers.any())).thenReturn(photo);
//
//        mockMvc = MockMvcBuilders.standaloneSetup(photosController).build();
//    }
//
//    @Test
//    public void testAddOffer() throws Exception {
//
//        String input = "{\n"+
//                "\"id\": 22,\n"+
//                "\"albumId\":2,\n"+
//                "\"title\":\"sdfhfv\",\n"+
//                "\"url\":\"sdfhfv\" ,\n"+
//                "\"thumbnailUrl\":\"sdfhfv\" \n"+
//                "}";
//        mockMvc.perform(post("/albums/2/photos")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(input))
//                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());
//    }
//
//
//}
