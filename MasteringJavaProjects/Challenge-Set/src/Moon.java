public final class Moon  extends HeavenlyBody{
    public Moon(String name, double orbitalPeriod){
        super(name, orbitalPeriod, bodyTypes.MOON);
    }

    @Override
    public boolean addSatellite(HeavenlyBody body){
        if(body.getBodyType() == bodyTypes.PLANET || body.getBodyType() == bodyTypes.DWARF_PLANET){
            System.out.println("Error: Moons can't have a planet or star as a satellite.");
            return false;
        }
        else{
            return super.addSatellite(body);
        }
    }
}
