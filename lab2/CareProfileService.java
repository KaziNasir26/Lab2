package lab2;

import java.util.ArrayList;
import java.util.List;

public class CareProfileService {
    private List<CareProfile> careProfiles = new ArrayList<>();

    public void addCareProfile(CareProfile careProfile) {
        careProfiles.add(careProfile);
    }

    public void updateCareProfile(CareProfile careProfile) {
        for (int i = 0; i < careProfiles.size(); i++) {
            if (careProfiles.get(i).getId() == careProfile.getId()) {
                careProfiles.set(i, careProfile);
                break;
            }
        }
    }

    public CareProfile getCareProfile(int id) {
        for (CareProfile careProfile : careProfiles) {
            if (careProfile.getId() == id) {
                return careProfile;
            }
        }
        return null;
    }
}
