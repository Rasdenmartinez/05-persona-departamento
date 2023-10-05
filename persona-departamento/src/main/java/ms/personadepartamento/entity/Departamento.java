package ms.personadepartamento.entity;


import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "M2")
    private Double m2;

    @Column(name = "PRECIO")
    private Double precio;

    public Departamento() {
    }

    public Departamento(Integer id, Double m2, Double precio) {
        this.id = id;
        this.m2 = m2;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", m2=" + m2 +
                ", precio=" + precio +
                '}';
    }
}
