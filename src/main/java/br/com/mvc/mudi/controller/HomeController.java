package br.com.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Echo Dot (3ª Geração)");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41GZCWFJB1L._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B07PDHSJ1H/ref=ods_gw_nh_atf23q1_cr_deskquadv2?pf_rd_r=J3ZBZDE04M9KW93BWAZB&pf_rd_p=70108310-aa5b-40cc-8e25-6551ff94d86a&pd_rd_r=8dbc77bf-018c-4811-b517-3bb82b35600f&pd_rd_w=yRze0&pd_rd_wg=TMR7h&ref_=pd_gw_unk");
		pedido.setDescricao("echo dot alexa");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
