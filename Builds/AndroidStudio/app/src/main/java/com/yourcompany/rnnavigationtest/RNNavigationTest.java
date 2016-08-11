/*
  ==============================================================================

   This file is part of the JUCE library.
   Copyright (c) 2015 - ROLI Ltd.

   Permission is granted to use this software under the terms of either:
   a) the GPL v2 (or any later version)
   b) the Affero GPL v3

   Details of these licenses can be found at: www.gnu.org/licenses

   JUCE is distributed in the hope that it will be useful, but WITHOUT ANY
   WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
   A PARTICULAR PURPOSE.  See the GNU General Public License for more details.

   ------------------------------------------------------------------------------

   To release a closed-source product which uses JUCE, commercial licenses are
   available: visit www.juce.com for more information.

  ==============================================================================
*/

package com.yourcompany.rnnavigationtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Handler;
import android.os.ParcelUuid;
import android.os.Environment;
import android.view.*;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.graphics.*;
import android.text.ClipboardManager;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.Runnable;
import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import android.media.AudioManager;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;
import android.Manifest;

import android.media.midi.*;
import android.bluetooth.*;
import android.bluetooth.le.*;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.reactnativenavigation.activities.RootActivity;
import com.reactnativenavigation.packages.RnnPackage;


//==============================================================================
public class RNNavigationTest   extends RootActivity
{
    /**
     * Returns a list of {@link ReactPackage} used by the app.
     * You'll most likely want to return at least the {@code MainReactPackage}.
     * If your app uses additional views or modules besides the default ones,
     * you'll want to include more packages here.
     */
    @Override
    public List<ReactPackage> getPackages() {
        return Arrays.asList(
                new RnnPackage(),
                new MainReactPackage()
        );

    }
}
