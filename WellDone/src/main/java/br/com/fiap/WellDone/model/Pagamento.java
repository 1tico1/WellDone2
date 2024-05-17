
package br.com.fiap.WellDone.model;

import java.math.BigDecimal;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@AllArgsConstructor 
@NoArgsConstructor 
@Entity
@Table(name = "pagamento")
public class Pagamento extends RepresentationModel<Pagamento>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagamento_id;   
    
    @Column(name = "pagamento_metodo", nullable = false)
    private String pagamento_metodo;
    
    @Column(name = "pagamento_vlr_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal  pagamento_vlr_total;
    
    @ManyToOne
    @JoinColumn(name = "pagamento_id_prod") 
    private Produto produto;  

    @ManyToOne
    @JoinColumn(name = "pagamento_id_cliente") 
    private Cliente cliente;  

    public Pagamento() {}

	public Pagamento(Long pagamento_id, String pagamento_metodo, BigDecimal pagamento_vlr_total, Produto produto,
			Cliente cliente) {
		super();
		this.pagamento_id = pagamento_id;
		this.pagamento_metodo = pagamento_metodo;
		this.pagamento_vlr_total = pagamento_vlr_total;
		this.produto = produto;
		this.cliente = cliente;
	}

	public Long getPagamento_id() {
		return pagamento_id;
	}

	public void setPagamento_id(Long pagamento_id) {
		this.pagamento_id = pagamento_id;
	}

	public String getPagamento_metodo() {
		return pagamento_metodo;
	}

	public void setPagamento_metodo(String pagamento_metodo) {
		this.pagamento_metodo = pagamento_metodo;
	}

	public BigDecimal getPagamento_vlr_total() {
		return pagamento_vlr_total;
	}

	public void setPagamento_vlr_total(BigDecimal pagamento_vlr_total) {
		this.pagamento_vlr_total = pagamento_vlr_total;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
    
	
   
}