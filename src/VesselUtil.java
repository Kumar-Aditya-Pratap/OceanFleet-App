import java.util.List;
import java.util.ArrayList;
public class VesselUtil {
    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {

        vesselList.add(new Vessel("V001", "Sea King", 25.5, "Cargo"));
        vesselList.add(new Vessel("V002", "Ocean Star", 18.0, "Tanker"));
        vesselList.add(new Vessel("V003", "Wave Rider", 22.3, "Cruise"));

        return vesselList;
    }
    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
}