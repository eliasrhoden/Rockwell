/**
 * Created by elias on 2017-05-12.
 * A gene to be used in Genomes/Nets
 */
public class ConnectionGene {
    public int inputNode;
    public int outputNode;
    public double weight;
    public int inovationNumber;
    public boolean enabled;

    public ConnectionGene(int inputNode, int outputNode,int inovationNumber){
        weight = 1;
        enabled = true;
        this.inputNode = inputNode;
        this.outputNode = outputNode;
        this.inovationNumber = inovationNumber;
    }

    public boolean equals(ConnectionGene gene){
        boolean res = true;
        res = res && this.weight == gene.weight;
        res = res && this.outputNode == gene.outputNode;
        res = res && this.inputNode == gene.inputNode;
        res = res && this.enabled == gene.enabled;
        res = res && this.inovationNumber == gene.inovationNumber;
        return res;
    }

}