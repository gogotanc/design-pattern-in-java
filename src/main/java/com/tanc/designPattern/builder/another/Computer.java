package com.tanc.designPattern.builder.another;

/**
 * 这里使用简化版本的建造模式，来进行电脑的建造
 */
public class Computer {

    private String name;
    private String cpu;
    private String system;
    private int ram;

    //私有构造方法
    private Computer(ConcreteBuilder builder) {
        this.name = builder.name;
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.system = builder.system;
    }

    /**
     * 电脑的一些操作
     */
    public void showMessage() {
        System.out.println("电脑名称：" + this.name);
        System.out.println("电脑 CPU 型号：" + this.cpu);
        System.out.println("电脑 RAM 大小：" + this.ram);
        System.out.println("操作系统：" + this.system);
    }

    /**
     * 电脑的一些操作
     */
    public void run() {
        System.out.println("电脑 " + this.name + " 开始运行。");
    }

    public static class ConcreteBuilder {

        private String name;
        private String cpu;
        private String system;
        private int ram;

        /**
         * 构造方法，传入必须要有的参数
         */
        public ConcreteBuilder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public ConcreteBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ConcreteBuilder setSystem(String system) {
            this.system = system;
            return this;
        }

        /**
         * 构建真正的对象并返回
         *
         * @return 构建的保险合同对象
         */
        public Computer build() {

            if (null == cpu) {
                throw new RuntimeException("电脑组装失败，没有 CPU");
            }

            if (0 >= ram) {
                throw new RuntimeException("电脑组装失败，没有 RAM");
            }

            if (null == system) {
                system = "Win 10";
            }

            if (null == name) {
                name = "default";
            }

            return new Computer(this);
        }
    }
}