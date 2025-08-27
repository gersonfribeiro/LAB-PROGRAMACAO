/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

/**
 *
 * @author Aluno
 */
public abstract class Animal {
//  nome, classe, família, idade, estado (vivo = true e morto = false), caloria (0 a 100) e força (0 a 100).
    private String nome;
    private ClassesAnimal classe;
    private FamiliasAnimal familia;
    private Integer idade;
    private Boolean estado;
    private Integer calorias;
    private Integer forca;

    public Animal() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClassesAnimal getClasse() {
        return classe;
    }

    public void setClasse(ClassesAnimal classe) {
        this.classe = classe;
    }

    public FamiliasAnimal getFamilia() {
        return familia;
    }

    public void setFamilia(FamiliasAnimal familia) {
        this.familia = familia;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }
    
    
//    nascer: pergunta os dados do animal (nome, classe e família). O animal recebe 10 de força e caloria, 0 na idade e true como estado;
//morrer: coloca 0 na força e false como estado;
//comer: caso o animal n?o esteja cheio e/ou morto, insere 10 no estado caloria e retira 2 de força;
//correr: caso o animal n?o esteja morto ou exausto (caloria = 0), retira 5 do estado força e 5 do estado caloria;
//dormir: caso o animal n?o esteja morto, insere 10 no estado força e retira 2 do estado caloria.
    
    abstract Animal nascer(String nome, ClassesAnimal classe, FamiliasAnimal familia);
    
    abstract void morrer(Animal animal);
    
    abstract void comer(Animal animal);
    
    abstract void correr(Animal animal);
    
    abstract void dormir(Animal animal);
}
