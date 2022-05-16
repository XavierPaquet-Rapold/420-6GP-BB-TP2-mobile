package ca.qc.bdeb.obj2022tp1mobile;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class DoorViewModel extends ViewModel {
    private final MutableLiveData<Integer> mTemperature = new MutableLiveData<>();
    private final MutableLiveData<Integer> mDistance = new MutableLiveData<>();
    private final MutableLiveData<Integer> mMotorSpeed = new MutableLiveData<>();
    private final MutableLiveData<String> mMotorDirection = new MutableLiveData<>();
    private Integer mMaxOverture;
    private Integer mMinOverture;
    private final MutableLiveData<String> mControlMode = new MutableLiveData<>();
    private final MutableLiveData<List<Integer>> mTemperatureHistory = new MutableLiveData<>();
    private final MutableLiveData<List<Integer>> mOvertureHistory = new MutableLiveData<>();


    public Integer getTemperature() {
        return mTemperature.getValue();
    }

    public void setTemperature(Integer temperature) {
        mTemperature.setValue(temperature);
    }

    public Integer getDistance() {
        return mDistance.getValue();
    }

    public void setDistance(Integer distance) {
        mDistance.setValue(distance);
    }

    public Integer getMotorSpeed() {
        return mMotorSpeed.getValue();
    }

    public void setMotorSpeed(Integer motorSpeed) {
        mMotorSpeed.setValue(motorSpeed);
    }

    public String getMotorDirection() {
        return mMotorDirection.getValue();
    }

    public void setMotorDirection(String motorDirection) {
        mMotorDirection.setValue(motorDirection);
    }

    public Integer getMaxOverture() {
        return mMaxOverture;
    }

    public void setMaxOverture(Integer maxOverture) {
        mMaxOverture = maxOverture;
    }

    public Integer getMinOverture() {
        return mMinOverture;
    }

    public void setMinOverture(Integer minOverture) {
        mMinOverture = minOverture;
    }

    public String getControlMode() {
        return mControlMode.getValue();
    }

    public void setControlMode(String controlMode) {
        mControlMode.setValue(controlMode);
    }

    public List<Integer> getTemperatureHistory() {
        return mTemperatureHistory.getValue();
    }

    public void setTemperatureHistory(List<Integer> temperatureHistory) {
        mTemperatureHistory.setValue(temperatureHistory);
    }

    public List<Integer> getOvertureHistory() {
        return mOvertureHistory.getValue();
    }

    public void setOvertureHistory(List<Integer> overtureHistory) {
        mOvertureHistory.setValue(overtureHistory);
    }
}
