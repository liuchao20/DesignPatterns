package com.lc.patterns.builder.demo3;

/**
 * @author: L.C
 * @date: 2023/10/31 20:39
 * @description: 链式编程构建对象
 */
public class Phone {
    private String cpu;
    private String memory;
    private String mainboard;
    private String screen;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
        this.screen = builder.screen;
    }

    public static final class Builder {
        private String cpu;
        private String memory;
        private String mainboard;
        private String screen;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        //使用构建者创建phone对象
        public Phone build(){
            return new Phone(this);
        }
    }
}
