public class Lab {

    /**
     * @param b a true/false value.
     * @return if b is true, return true. if b is false, return false.
     */
    public boolean returnBoolean(boolean b){
        return b;
    }

    /**
     * @param b a true/false value.
     * @return the opposite of b.
     */
    public boolean returnNot(boolean b){
        return !b;
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if both b1 and b2 are true. false otherwise.
     */
    public boolean returnAnd(boolean b1, boolean b2){
        return b1 && b2;
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if either b1 or b2 are true. false if both are false.
     */
    public boolean returnOr(boolean b1, boolean b2){
        return b1 || b2;
    }
}
