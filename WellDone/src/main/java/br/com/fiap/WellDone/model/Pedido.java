package br.com.fiap.WellDone.model;

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
@Table(name= "pedido")
public class Pedido extends RepresentationModel<Pedido>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedido_id;

    @Column(name = "pedido_qtd", nullable = false)
    private Integer pedido_qtd;

    @Column(name = "pedido_status", nullable = false, length = 255)
    private String pedido_status;

    @ManyToOne
    @JoinColumn(name = "pedido_id_cliente")
    private Cliente cliente; 
    @ManyToOne
    @JoinColumn(name = "pedido_id_produto")
    private Produto produto;
	
    public Pedido() {}
    
    public Pedido(Long pedido_id, Integer pedido_qtd, String pedido_status, Cliente cliente, Produto produto) {
		super();
		this.pedido_id = pedido_id;
		this.pedido_qtd = pedido_qtd;
		this.pedido_status = pedido_status;
		this.cliente = cliente;
		this.produto = produto;
	}

	public Long getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Long pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Integer getPedido_qtd() {
		return pedido_qtd;
	}

	public void setPedido_qtd(Integer pedido_qtd) {
		this.pedido_qtd = pedido_qtd;
	}

	public String getPedido_status() {
		return pedido_status;
	}

	public void setPedido_status(String pedido_status) {
		this.pedido_status = pedido_status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}  
    
    
}
