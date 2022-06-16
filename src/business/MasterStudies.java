package business;

public class MasterStudies extends Trial{
    private String masterName;
    private int masterECTSNumber;
    private int creditPassProbability;


    public MasterStudies(String masterName, int masterECTSNumber, int creditPassProbability) {
        this.masterName = masterName;
        this.masterECTSNumber = masterECTSNumber;
        this.creditPassProbability = creditPassProbability;
    }
}
