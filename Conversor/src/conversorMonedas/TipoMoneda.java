package conversorMonedas;

import javax.swing.JOptionPane;

public class TipoMoneda {
	
	ConvertirMoneda moneda = new ConvertirMoneda();
	
	public void convertirMoneda(double monto){
		String opcion = (JOptionPane.showInputDialog(null,
				"Seleccione la moneda a la que deseas convertir tu dinero", "Monedas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{ "Pesos Argentinos a Dolar", "Pesos Uruguayos a Dolar", "Reales Brasileros a Dolar",
				  "Pesos Argentinos a Euro", "Pesos Uruguayos a Euro", "Reales Brasileños a Euro"}, 
				"Selección")).toString();
		
		switch (opcion) {
			case "Pesos Argentinos a Dolar": {
				moneda.convertirPesoArgADolar(monto);
				break;
			}
			case "Pesos Uruguayos a Dolar": {
				moneda.convertirPesosUrugADolar(monto);
				break;
			}
			case "Reales Brasileros a Dolar": {
				moneda.convertirRealADolar(monto);
				break;
			}
		
			case "Pesos Argentinos a Euro": {
				moneda.convertirPesoArgAEuro(monto);
				break;
			}
			case "Pesos Uruguayos a Euro": {
				moneda.convertirPesosUrugAEuro(monto);
				break;
			}
			case "Reales Brasileños a Euro": {
				moneda.convertirRealAEuro(monto);
				break;
			}
	
		}
	}
}
