// Generated by view binder compiler. Do not edit!
package com.test.gravardados.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.test.gravardados.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFormLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final EditText emailFields;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final MaterialToolbar loginToolbar;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final EditText passwordFields;

  @NonNull
  public final TextView textEmail;

  @NonNull
  public final TextView textPassword;

  @NonNull
  public final TextView titleLogin;

  private ActivityFormLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnLogin, @NonNull EditText emailFields,
      @NonNull FrameLayout fragmentContainer, @NonNull MaterialToolbar loginToolbar,
      @NonNull ConstraintLayout main, @NonNull EditText passwordFields, @NonNull TextView textEmail,
      @NonNull TextView textPassword, @NonNull TextView titleLogin) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.emailFields = emailFields;
    this.fragmentContainer = fragmentContainer;
    this.loginToolbar = loginToolbar;
    this.main = main;
    this.passwordFields = passwordFields;
    this.textEmail = textEmail;
    this.textPassword = textPassword;
    this.titleLogin = titleLogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFormLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFormLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_form_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFormLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      AppCompatButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.emailFields;
      EditText emailFields = ViewBindings.findChildViewById(rootView, id);
      if (emailFields == null) {
        break missingId;
      }

      id = R.id.fragmentContainer;
      FrameLayout fragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainer == null) {
        break missingId;
      }

      id = R.id.loginToolbar;
      MaterialToolbar loginToolbar = ViewBindings.findChildViewById(rootView, id);
      if (loginToolbar == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.passwordFields;
      EditText passwordFields = ViewBindings.findChildViewById(rootView, id);
      if (passwordFields == null) {
        break missingId;
      }

      id = R.id.textEmail;
      TextView textEmail = ViewBindings.findChildViewById(rootView, id);
      if (textEmail == null) {
        break missingId;
      }

      id = R.id.textPassword;
      TextView textPassword = ViewBindings.findChildViewById(rootView, id);
      if (textPassword == null) {
        break missingId;
      }

      id = R.id.titleLogin;
      TextView titleLogin = ViewBindings.findChildViewById(rootView, id);
      if (titleLogin == null) {
        break missingId;
      }

      return new ActivityFormLoginBinding((ConstraintLayout) rootView, btnLogin, emailFields,
          fragmentContainer, loginToolbar, main, passwordFields, textEmail, textPassword,
          titleLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
