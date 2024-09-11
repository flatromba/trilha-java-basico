package exemploInterface.estabelecimento;

import exemploInterface.equipamentos.copiadora.Copiadora;
import exemploInterface.equipamentos.copiadora.Xerox;
import exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import exemploInterface.equipamentos.digitalizadora.Scanner;
import exemploInterface.equipamentos.impressora.Deskjet;
import exemploInterface.equipamentos.impressora.Impressora;
import exemploInterface.equipamentos.impressora.Laserjet;
import exemploInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {    
    public static void main(String[] args) throws Exception {
        EquipamentoMultifuncional equipamento=new EquipamentoMultifuncional();

        Copiadora copiadora1=new Xerox();
        Copiadora copiadora2=equipamento;

        Digitalizadora digitalizadora1=new Scanner();
        Digitalizadora digitalizadora2=equipamento;
        
        Impressora impressora1= new Deskjet();
        Impressora impressora2= new Laserjet();
        Impressora impressora3= equipamento;

        copiadora1.copiar();
        copiadora2.copiar();

        digitalizadora1.digitalizar();
        digitalizadora2.digitalizar();

        impressora1.imprimir();
        impressora2.imprimir();
        impressora3.imprimir();
    }
}
