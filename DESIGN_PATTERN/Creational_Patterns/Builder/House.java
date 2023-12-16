package DESIGN_PATTERN.Creational_Patterns.Builder;

public class House {
    String roof;
    String walls;
    String light;
    String fans;
    String tablet;
    String monitor;
    String phone;
    private House(HouseBuilder builder){
        this.roof = builder.roof;
        this.walls = builder.walls;
        this.light = builder.light;
        this.fans = builder.fans;
        this.tablet = builder.tablet;
        this.monitor = builder.monitor;
        this.phone = builder.phone;
    }

    public static class HouseBuilder{
        private String roof;
        private String walls;
        private String light;
        private String fans;
        private String tablet;
        private String monitor;
        private String phone;

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setLight(String light) {
            this.light = light;
            return this;
        }

        public HouseBuilder setFans(String fans) {
            this.fans = fans;
            return this;
        }

        public HouseBuilder setTablet(String tablet) {
            this.tablet = tablet;
            return this;
        }

        public HouseBuilder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public HouseBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
