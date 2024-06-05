package druk;

import dokumenty.Faktura;

public class WydrukFaktury {
    private WydrukFakturyTemplate drukowanieFakturyTemplate;

    public WydrukFaktury(WydrukFakturyTemplate drukowanieFakturyTemplate) {
        this.drukowanieFakturyTemplate = drukowanieFakturyTemplate;
    }

    public void drukujFakture(Faktura faktura) {
        drukowanieFakturyTemplate.drukujFaktureTemplate(faktura);
    }
}
