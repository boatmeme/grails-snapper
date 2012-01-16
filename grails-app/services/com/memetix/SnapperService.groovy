package com.memetix


import java.net.URL;
import org.fit.cssbox.demo.ImageRenderer

class SnapperService {
    static transactional = false
    
    def generateThumbnail(urlString) {
        def renderer = new ImageRenderer()
        File fout = new File('outfile.png');
        FileOutputStream out = new FileOutputStream(fout);
        def url = new URL(urlString)
        renderer.renderURL(urlString,out,ImageRenderer.TYPE_PNG)
        return url.toString()
    }
    
    
}
