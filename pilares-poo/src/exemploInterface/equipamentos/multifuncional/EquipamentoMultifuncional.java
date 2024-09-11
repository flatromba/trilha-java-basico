package exemploInterface.equipamentos.multifuncional;

import exemploInterface.equipamentos.copiadora.Copiadora;
import exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import exemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
    
}
