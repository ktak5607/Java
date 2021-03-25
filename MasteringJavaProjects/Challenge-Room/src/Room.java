public class Room {
    private Couch couch;
    private TV tv;
    private Outlet outlet;
    private Lights lights;

    public Room(Couch couch, TV tv, Outlet outlet, Lights lights) {
        this.couch = couch;
        this.tv = tv;
        this.outlet = outlet;
        this.lights = lights;
    }
}
