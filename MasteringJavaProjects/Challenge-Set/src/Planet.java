public final class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, bodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == bodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            System.out.println("The heavenly body you sent isn't a moon.");
            return false;
        }
    }
}
