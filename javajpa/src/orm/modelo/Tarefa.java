package orm.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity                          //linka a classe com o banco, e referencia ao cara logo abaixo //
@Table(name="Tarefas")
public class Tarefa {
	@Id                         //a anotação @Id identifica o atribto como chave primaria //
	@GeneratedValue             //a anotação @GeneratedValue identifica o atributo como auto-increment //
	private Long id;
	
	@Column(name="decricao_tarefa", nullable=false)
	private String descricao;
	private boolean finalizacao;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataFinalizacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizacao() {
		return finalizacao;
	}
	public void setFinalizacao(boolean finalizacao) {
		this.finalizacao = finalizacao;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
