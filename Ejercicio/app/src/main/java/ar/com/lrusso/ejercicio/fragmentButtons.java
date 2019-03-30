package ar.com.lrusso.ejercicio;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class fragmentButtons extends Fragment {

    private Button alertButton;
    private Button toastButton;

    public fragmentButtons(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_buttons, container, false);
        alertButton = (Button)rootView.findViewById(R.id.alertButton);
        alertButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(getActivity()).setTitle(getActivity().getResources().getString(R.string.stringButtonTitle)).setMessage(getActivity().getResources().getString(R.string.stringButtonMessage)).setPositiveButton(getActivity().getResources().getString(R.string.stringButtonOK),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
            }
        });
        toastButton = (Button)rootView.findViewById(R.id.toastButton);
        toastButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),getActivity().getResources().getString(R.string.stringToastExample),Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}