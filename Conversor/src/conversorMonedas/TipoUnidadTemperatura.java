package conversorMonedas;

import javax.swing.JOptionPane;

public class TipoUnidadTemperatura {
	
	ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();
	
	public void tipoUnidad(double temp) {
		String unidadEntrada = (JOptionPane.showInputDialog(null,
				"Seleccione la unidad de temperaura ingresada", "Unidad de Temperatura", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{ "Grados Celsius -> Fahrenheit", "Grados Celsius -> Kelvin", "Grados Fahrenheit -> Celsius", 
				  "Grados Fahrenheit -> Klevin", "Grados Kelvin -> Celsius", "Grados Kelvin -> Fahrenheit"}, 
				"Selección")).toString();
		
	
		switch (unidadEntrada) {
			case "Grados Celsius -> Fahrenheit": {
				convertirTemperatura.convertirCelsiusToFahrenheit(temp);
				break;
			}
			case "Grados Celsius -> Kelvin": {
				convertirTemperatura.convertirCelsiusToKelvin(temp);
				break;
			}
			case "Grados Fahrenheit -> Celsius": {
				convertirTemperatura.convertirFahrenheitToCelsius(temp);
				break;
			}
			case "Grados Fahrenheit -> Klevin": {
				convertirTemperatura.convertirFahrenheitToKelvin(temp);
				break;
			}
			case "Grados Kelvin -> Celsius": {
				convertirTemperatura.convertirKelvinToCelsius(temp);
				break;
			}
			case "Grados Kelvin -> Fahrenheit": {
				convertirTemperatura.convertirKelvinToFahrenheit(temp);
				break;
			}
		}
		
	}
	
	
}


