//package com.gs.Albums;
//import static org.mockito.Matchers.eq;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import com.gs.Albums.controllers.AlbumController;
//import com.gs.Albums.models.Albums;
//import com.gs.Albums.services.AlbumService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.io.IOException;
//import java.net.URISyntaxException;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringRunner.class)
//public class AlbumAppTest {
//
//    private HttpHeaders httpHeaders = new HttpHeaders();
//    @Autowired
//    private MockMvc mockMvc;
//
//    @InjectMocks
//    AlbumController albumController;
//
//    @MockBean
//    AlbumService albumService;
//
//    private Albums albums;
//
//    Albums getAlbums (){
//        Albums albums = new Albums();
//        albums.setId(121L);
//        albums.setUserId(2L);
//        albums.setTitle("fwefeg freff");
//        return albums;
//
//    }
//
//    @Test
//    public void testGetBankMandate() {
//        ResponseEntity responseEntity = albumService.getAllAlbums(albums.getId());
//        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//        Assert.assertEquals(albums, responseEntity.getBody());
//    }
//
//}

