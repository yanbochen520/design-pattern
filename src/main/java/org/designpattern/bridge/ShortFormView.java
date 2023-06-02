package org.designpattern.bridge;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:33
 */
public class ShortFormView  extends   View{
    public ShortFormView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return this.resource.snippet();
    }
}
