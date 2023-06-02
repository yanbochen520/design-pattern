package org.designpattern.bridge;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:16
 */
public class LongFormView extends   View{
    public LongFormView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return  resource.snippet();
    }
}
