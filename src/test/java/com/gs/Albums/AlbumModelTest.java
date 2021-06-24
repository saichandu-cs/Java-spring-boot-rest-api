package com.gs.Albums;

import com.gs.Albums.models.Albums;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlbumModelTest {

    private Albums album;

    @Before
    public void setUp()
    {
        album=new Albums();
        album.setUserId(4L);
        album.setTitle("saichandu Test");
    }

    @Test
    public void modelTest()
    {
        Albums testAlbum=new Albums();
        testAlbum.setTitle(album.getTitle());
        testAlbum.setUserId(album.getUserId());
        Assert.assertSame(testAlbum.getTitle(),album.getTitle());

    }


}
