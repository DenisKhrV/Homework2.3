public class ServiceStation{
    public void check(Serviceable serviceable) {
        serviceable.doService();
    }

    public void check(Vehicle vehicle) {
        vehicle.doService();
    }
}
