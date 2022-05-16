package ca.qc.bdeb.obj2022tp1mobile;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ControleFragment extends Fragment {
    RadioGroup mRadioGroup;
    List<String> mRadioButtonsText;
    List<RadioButton> mRadioButtons;
    int mOverturePercentage;

    private void onRadioButtonClicked(View view){
        //empty
    }

    private void displayButtons(List<RadioButton> radioButtons, RadioGroup radioGroup) {
        for(int wIndex = 0; wIndex < mRadioButtons.size(); wIndex++) {
            radioGroup.addView(radioButtons.get(wIndex), wIndex);
        }
    }

    private void showMessage(Context context, String title) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setCancelable(true);
        alertDialogBuilder.setView(R.layout.popup_manual_settings);
        final AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", (dialogInterface, i) -> {
            SeekBar wSeekBar = alertDialog.findViewById(R.id.seekbar_manual);
            mOverturePercentage = wSeekBar.getProgress() * 10;
        });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", (dialogInterface, i) -> {
            //Do nothing
        });
        alertDialog.show();
        SeekBar wSeekbar = alertDialog.findViewById(R.id.seekbar_manual);
        wSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Write code to perform some action when progress is changed.
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Write code to perform some action when touch is started.
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Write code to perform some action when touch is stopped.
                Toast.makeText(context, "Le pourcentage d'ouverture sera " + seekBar.getProgress() * 10 + "%", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public ControleFragment() {
        mRadioButtonsText = new ArrayList<>();
        mRadioButtons = new ArrayList<>();
        mRadioButtonsText.add("Automatique");
        mRadioButtonsText.add("Manuel");
        mRadioButtonsText.add("Ouvrir la porte");
        mRadioButtonsText.add("Fermer la porte");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View wView = inflater.inflate(R.layout.fragment_controle, container, false);
        mRadioGroup = wView.findViewById(R.id.radiogroup_actions);
        mRadioButtons.clear();

        RadioButton wButton;

        wButton = new RadioButton(wView.getContext());
        wButton.setText("Automatique");
        mRadioButtons.add(wButton);

        wButton = new RadioButton(wView.getContext());
        wButton.setText("Manuel");
        wButton.setOnClickListener(button -> {
            showMessage(wView.getContext(), "Pourcentage d'ouverture");
        });
        mRadioButtons.add(wButton);

        wButton = new RadioButton(wView.getContext());
        wButton.setText("Ouvrir la porte");
        mRadioButtons.add(wButton);

        wButton = new RadioButton(wView.getContext());
        wButton.setText("Fermer la porte");
        mRadioButtons.add(wButton);

        displayButtons(mRadioButtons, mRadioGroup);
        return wView;
    }

}