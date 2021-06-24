//package com.gs.Albums;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//import com.gs.Albums.models.Albums;
//import com.gs.Albums.repository.AlbumRepository;
//import com.gs.Albums.services.AlbumService;
//import org.checkerframework.checker.units.qual.A;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//@ExtendWith(MockitoExtension.class)
//public class ControllerATest {
//    @Mock
//    AlbumRepository albumrepoMock;
//
//    @MockBean
//    AlbumService albumServiceMock;
//
//    @Before
//    public void setup()
//    {
//        Albums a=new Albums();
//        a.setTitle("veiv");
//        a.setUserId(3322L);
//        a.setId(12333L);
//        albumrepoMock.save(a);
//    }
//
//    @Test
//    public void testQuery()  {
//        assertNotNull(albumrepoMock);
////        when(albumrepoMock.findAll().size()).thenReturn(100);
//
//
//        AlbumService t=new AlbumService(albumrepoMock);
//        int check = t.getAllAlbums().size();
//        Albums a=albumrepoMock.getById(12333L);
//        assertEquals(1,albumServiceMock.getAllAlbums().size());
//    }
//
//}