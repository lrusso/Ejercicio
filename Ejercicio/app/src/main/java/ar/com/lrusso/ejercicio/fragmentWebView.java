package ar.com.lrusso.ejercicio;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fragmentWebView extends Fragment {

    private WebView webView;

    public fragmentWebView(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String browseTo = getArguments().getString("browseTo");
        View rootView = inflater.inflate(R.layout.fragment_webview, container, false);
        webView = (WebView)rootView.findViewById(R.id.webView1);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(browseTo);
        return rootView;
    }
}