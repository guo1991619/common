package com.jokers.pojo.bo;

/**
 * <p>CellTowersBo class.</p>
 *
 * @author yuton
 * @version 1.0
 * @since 2017/4/20 16:56
 */
public class CellTowersBo {

    /**
     * cellId : 42 小区唯一标识符
     * locationAreaCode : 415 GSM 和 WCDMA 网络的位置区域代码 (LAC)。CDMA 网络的网络 ID (NID)。
     * mobileCountryCode : 310 移动电话基站的移动国家代码 (MCC)。
     * mobileNetworkCode : 410 移动电话基站的移动网络代码。对于 GSM 和 WCDMA，这就是 MNC；CDMA 使用的是系统 ID (SID)。
     * age : 0
     * signalStrength : -60 信号强度(非必须)
     * timingAdvance : 15 时间提前值(非必须)
     */

    private int cellId;
    private int locationAreaCode;
    private int mobileCountryCode;
    private int mobileNetworkCode;
    private int age;
    private int signalStrength;
    private int timingAdvance;

    /**
     * <p>Getter for the field <code>cellId</code>.</p>
     *
     * @return a int.
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * <p>Setter for the field <code>cellId</code>.</p>
     *
     * @param cellId a int.
     */
    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    /**
     * <p>Getter for the field <code>locationAreaCode</code>.</p>
     *
     * @return a int.
     */
    public int getLocationAreaCode() {
        return locationAreaCode;
    }

    /**
     * <p>Setter for the field <code>locationAreaCode</code>.</p>
     *
     * @param locationAreaCode a int.
     */
    public void setLocationAreaCode(int locationAreaCode) {
        this.locationAreaCode = locationAreaCode;
    }

    /**
     * <p>Getter for the field <code>mobileCountryCode</code>.</p>
     *
     * @return a int.
     */
    public int getMobileCountryCode() {
        return mobileCountryCode;
    }

    /**
     * <p>Setter for the field <code>mobileCountryCode</code>.</p>
     *
     * @param mobileCountryCode a int.
     */
    public void setMobileCountryCode(int mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    /**
     * <p>Getter for the field <code>mobileNetworkCode</code>.</p>
     *
     * @return a int.
     */
    public int getMobileNetworkCode() {
        return mobileNetworkCode;
    }

    /**
     * <p>Setter for the field <code>mobileNetworkCode</code>.</p>
     *
     * @param mobileNetworkCode a int.
     */
    public void setMobileNetworkCode(int mobileNetworkCode) {
        this.mobileNetworkCode = mobileNetworkCode;
    }

    /**
     * <p>Getter for the field <code>age</code>.</p>
     *
     * @return a int.
     */
    public int getAge() {
        return age;
    }

    /**
     * <p>Setter for the field <code>age</code>.</p>
     *
     * @param age a int.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * <p>Getter for the field <code>signalStrength</code>.</p>
     *
     * @return a int.
     */
    public int getSignalStrength() {
        return signalStrength;
    }

    /**
     * <p>Setter for the field <code>signalStrength</code>.</p>
     *
     * @param signalStrength a int.
     */
    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }

    /**
     * <p>Getter for the field <code>timingAdvance</code>.</p>
     *
     * @return a int.
     */
    public int getTimingAdvance() {
        return timingAdvance;
    }

    /**
     * <p>Setter for the field <code>timingAdvance</code>.</p>
     *
     * @param timingAdvance a int.
     */
    public void setTimingAdvance(int timingAdvance) {
        this.timingAdvance = timingAdvance;
    }
}
