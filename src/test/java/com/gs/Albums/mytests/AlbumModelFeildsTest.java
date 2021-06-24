package com.gs.Albums.mytests;

import com.gs.Albums.models.Albums;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class AlbumModelFeildsTest {


    Albums album =new Albums();
    Albums album1;

    @Before
    public void setup()
    {
        album.setId(3L);
        album.setTitle("dewdfewfew");
        album.setUserId(2L);
    }

    @Test
    public void test1()
    {
        assertEquals(album.getTitle(),"dewdfewfew");
        assertEquals(album.getUserId(),"2L");
//        assertEquals(album.getId(),3L);
//        assertEquals(album.getUserId(),2L);
    }





}
