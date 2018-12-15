package com.automationpractice.taller2.stepdefinitions;

import com.automationpractice.taller2.steps.comparacionSteps;
import com.automationpractice.taller2.steps.compraSteps;
import com.automationpractice.taller2.steps.loginSteps;
import com.automationpractice.taller2.steps.vitrinaSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class tiendaveranoStepDefinitions {

//	Código para maximar una pagina si no estamos utilizando un front en nuestro caso serenity

//	private WebDriver driver = new ChromeDriver();
//
//	@Before
//	public void maximizar() {
//		driver.manage().window().maximize();
//		driver.get("https://google.com");
//	}

	@Steps
	loginSteps logeo;

	@Steps
	vitrinaSteps vitrina;

	@Steps
	comparacionSteps compara;

	@Steps
	compraSteps compra;

	@Steps
	compraSteps pago;

	@Steps
	compraSteps orden;

	@Given("^Que me logueo en la tienda online$")
	public void queMeLogueoEnLaTiendaOnline() throws Exception {
		logeo.abrirPagina();
		logeo.registrarme();

	}

	@Given("^ingreso usuario y contrasena$")
	public void ingresoUsuarioYContrasena(DataTable datosAutenticacion) throws Exception {
		logeo.ingresarEmail(datosAutenticacion);
		logeo.clickPwd();
		logeo.ingresarPwd(datosAutenticacion);

	}

	@When("^Selecciono el boton de loguear$")
	public void seleccionoElBotonDeLoguear() throws Exception {
		logeo.btnregistrarme();
	}

	@Then("^Estoy logeado en la tienda$")
	public void estoyLogeadoEnLaTienda() throws Exception {
		System.out.println("Estoy en: Estoy logeado en la tienda Scenario 1");
	}

	@Given("^Que selecciono la categoria de summer dresses$")
	public void queSeleccionoLaCategoriaDeSummerDresses() throws Exception {
		System.out.println("voy a ingresar vitrina.dresses");
		vitrina.dresses();
		System.out.println("Estoy en: vitrina.dresses");
		vitrina.summer();
		System.out.println("Estoy en: vitrina.summer");
		System.out.println("Estoy en: Que selecciono la categoria de summer dresses");
	}

	@Given("^Selecciono el vestido mas economico de la lista de resultados$")
	public void seleccionoElVestidoMasEconomicoDeLaListaDeResultados() throws Exception {
//		System.out.println("Estoy en: Selecciono el vestido mas economico de la lista de resultados");
//		 compara.recorrer();
//		 compara.seleccionar(compara.recorrer());
//		 compara.seleccionarCarrito();
	}

	@When("^Compro el vestido$")
	public void comproElVestido() throws Exception {

		compra.compraVestido();
		compra.checkout();
		compra.pagoVestido();
		compra.pasarxCaja();
		compra.envio();
		compra.terminos();
		compra.cheque();
		compra.confOrden();
		compra.completa();
		System.out.println("Estoy en: Compro el vestido");
	}

	@When("^Pago con cheque$")
	public void pagoConCheque() throws Exception {
		
//		pago.pagoVestido();
//		pago.pasarxCaja();
//		pago.terminos();
//		pago.envio();
//		pago.cheque();
//		pago.confOrden();
//		System.out.println("Estoy en: Pago con cheque");
	}

	@Then("^He comprado el vestido$")
	public void heCompradoElVestido() throws Exception {

		// orden.completa();
		// assertThat(orden.completa()).isEqualToIgnoringCase("Your order on My Store is
		// complete.");
//		   System.out.println("Estoy en: He comprado el vestido");
	}

	@Given("^Que tengo la orden de compra de un vestido$")
	public void queTengoLaOrdenDeCompraDeUnVestido() throws Exception {
//		System.out.println("Estoy en: Que tengo la orden de compra de un vestido");

	}

	@When("^Ingreso al historial de compras$")
	public void ingresoAlHistorialDeCompras() throws Exception {
//		System.out.println("Estoy en: Ingreso al historial de compras");

	}

	@Then("^Veo la orden de compra en el historial$")
	public void veoLaOrdenDeCompraEnElHistorial() throws Exception {
//		System.out.println("Estoy en: Veo la orden de compra en el historial");

	}

}
