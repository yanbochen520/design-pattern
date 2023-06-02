package org.designpattern.bridge;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:26
 */
public class EngineerResource implements Resource {

    private  Engineer engineer;

    public EngineerResource(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public String snippet() {
        return engineer.intro();
    }
}
