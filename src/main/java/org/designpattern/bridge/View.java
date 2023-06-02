package org.designpattern.bridge;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 17:53
 */
public abstract class  View {
    Resource resource;

    public View(Resource resource) {
        this.resource = resource;
    }

    public abstract String show();

}
