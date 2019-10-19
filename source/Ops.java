/**
 * <li>{@link #NOP}</li>
 */
public enum Ops {
    /**
     * Performs no operation
     */
    NOP(0),
    IFL(1),
    IFG(1),
    IFZ(1),
    IFE(2),
    TCC(0),
    TCW(0),
    JMP(1),
    INC(1),
    SEE(0),
    SDR(0),
    SML(0),
    SNB(0),
    SLF(0);
    int variablesNeeded;
    private Ops(int n) {
        variablesNeeded = n;
    }
}
