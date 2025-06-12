package org.cocos2dx.lib;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public class Cocos2dxEditBoxHelper {
    private static final String TAG;
    private static Cocos2dxActivity mCocos2dxActivity;
    private static SparseArray mEditBoxArray;
    private static ResizeLayout mFrameLayout;
    private static int mViewTag;

    static {
        Cocos2dxEditBoxHelper.TAG = "Cocos2dxEditBoxHelper";
        Cocos2dxEditBoxHelper.mViewTag = 0;
    }

    public Cocos2dxEditBoxHelper(ResizeLayout layout) {
        Cocos2dxEditBoxHelper.mFrameLayout = layout;
        Cocos2dxEditBoxHelper.mCocos2dxActivity = (Cocos2dxActivity)Cocos2dxActivity.getContext();
        Cocos2dxEditBoxHelper.mEditBoxArray = new SparseArray();
    }

    public static void __editBoxEditingChanged(int index, String text) {
        Cocos2dxEditBoxHelper.editBoxEditingChanged(index, text);
    }

    public static void __editBoxEditingDidBegin(int index) {
        Cocos2dxEditBoxHelper.editBoxEditingDidBegin(index);
    }

    public static void __editBoxEditingDidEnd(int index, String text) {
        Cocos2dxEditBoxHelper.editBoxEditingDidEnd(index, text);
    }

    // 去混淆评级： 低(20)
    static String access$200() [...] // Potential decryptor

    public static void closeKeyboard(int index) {
        InputMethodManager imm = (InputMethodManager)Cocos2dxActivity.getContext().getSystemService("input_method");
        Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
        if(editBox != null) {
            imm.hideSoftInputFromWindow(editBox.getWindowToken(), 0);
            Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().setSoftKeyboardShown(false);
        }
    }

    public static int convertToSP(float point) {
        return (int)TypedValue.applyDimension(2, point, Cocos2dxEditBoxHelper.mCocos2dxActivity.getResources().getDisplayMetrics());
    }

    public static int createEditBox(int left, int top, int width, int height, float scaleX) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = new Cocos2dxEditBox(Cocos2dxEditBoxHelper.mCocos2dxActivity);
                editBox.setFocusable(true);
                editBox.setFocusableInTouchMode(true);
                editBox.setInputFlag(4);
                editBox.setInputMode(6);
                editBox.setReturnType(0);
                editBox.setHintTextColor(0xFF888888);
                editBox.setVisibility(4);
                editBox.setBackgroundColor(0);
                editBox.setTextColor(-1);
                editBox.setSingleLine();
                editBox.setOpenGLViewScaleX(scaleX);
                float density = Cocos2dxEditBoxHelper.mCocos2dxActivity.getResources().getDisplayMetrics().density;
                int paddingBottom = Cocos2dxEditBoxHelper.convertToSP(((float)(((int)(((float)height) * 0.33f / density)))) - scaleX * 5.0f / density);
                editBox.setPadding(Cocos2dxEditBoxHelper.convertToSP(((int)(scaleX * 5.0f / density))), paddingBottom / 2, 0, paddingBottom / 2);
                FrameLayout.LayoutParams lParams = new FrameLayout.LayoutParams(-2, -2);
                lParams.leftMargin = left;
                lParams.topMargin = top;
                lParams.width = width;
                lParams.height = height;
                lParams.gravity = 51;
                Cocos2dxEditBoxHelper.mFrameLayout.addView(editBox, lParams);
                editBox.addTextChangedListener(new TextWatcher() {
                    @Override  // android.text.TextWatcher
                    public void afterTextChanged(Editable s) {
                    }

                    @Override  // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override  // android.text.TextWatcher
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnGLThread(new Runnable() {
                            @Override
                            public void run() {
                                Cocos2dxEditBoxHelper.__editBoxEditingChanged(org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.this.val$index, s.toString());
                            }
                        });
                    }
                });
                editBox.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override  // android.view.View$OnFocusChangeListener
                    public void onFocusChange(View v, boolean hasFocus) {
                        if(hasFocus) {
                            Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnGLThread(new Runnable() {
                                @Override
                                public void run() {
                                    Cocos2dxEditBoxHelper.__editBoxEditingDidBegin(org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.this.val$index);
                                }
                            });
                            int v = editBox.getText().length();
                            editBox.setSelection(v);
                            Cocos2dxEditBoxHelper.mFrameLayout.setEnableForceDoLayout(true);
                            Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().setSoftKeyboardShown(true);
                            Log.d("Cocos2dxEditBoxHelper", "edit box get focus");
                            return;
                        }
                        editBox.setVisibility(8);
                        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnGLThread(new Runnable() {
                            @Override
                            public void run() {
                                String s = org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.2.this.val$editBox.getText().toString();
                                Cocos2dxEditBoxHelper.__editBoxEditingDidEnd(org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.this.val$index, s);
                            }
                        });
                        Cocos2dxEditBoxHelper.mFrameLayout.setEnableForceDoLayout(false);
                        Log.d("Cocos2dxEditBoxHelper", "edit box lose focus");
                    }
                });
                editBox.setOnKeyListener(new View.OnKeyListener() {
                    @Override  // android.view.View$OnKeyListener
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        if(event.getAction() == 0 && keyCode == 66 && (editBox.getInputType() & 0x20000) != 0x20000) {
                            Cocos2dxEditBoxHelper.closeKeyboard(org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.this.val$index);
                            Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().requestFocus();
                            return true;
                        }
                        return false;
                    }
                });
                editBox.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override  // android.widget.TextView$OnEditorActionListener
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        if(actionId == 6) {
                            Cocos2dxEditBoxHelper.closeKeyboard(org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.this.val$index);
                            Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().requestFocus();
                        }
                        return false;
                    }
                });
                Cocos2dxEditBoxHelper.mEditBoxArray.put(Cocos2dxEditBoxHelper.mViewTag, editBox);
            }
        });
        int v4 = Cocos2dxEditBoxHelper.mViewTag;
        Cocos2dxEditBoxHelper.mViewTag = v4 + 1;
        return v4;
    }

    private static native void editBoxEditingChanged(int arg0, String arg1) {
    }

    private static native void editBoxEditingDidBegin(int arg0) {
    }

    private static native void editBoxEditingDidEnd(int arg0, String arg1) {
    }

    public static void openKeyboard(int index) {
        InputMethodManager imm = (InputMethodManager)Cocos2dxActivity.getContext().getSystemService("input_method");
        Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
        if(editBox != null) {
            imm.showSoftInput(editBox, 0);
            Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().setSoftKeyboardShown(true);
        }
    }

    public static void removeEditBox(int index) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    Cocos2dxEditBoxHelper.mEditBoxArray.remove(index);
                    Cocos2dxEditBoxHelper.mFrameLayout.removeView(editBox);
                    Log.e("Cocos2dxEditBoxHelper", "remove EditBox");
                }
            }
        });
    }

    public static void setEditBoxViewRect(int index, int left, int top, int maxWidth, int maxHeight) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setEditBoxViewRect(left, top, maxWidth, maxHeight);
                }
            }
        });
    }

    public static void setFont(int index, String fontName, float fontSize) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    Typeface tf = fontName.isEmpty() ? Typeface.DEFAULT : Typeface.create(fontName, 0);
                    if(fontSize >= 0.0f) {
                        DisplayMetrics displayMetrics0 = Cocos2dxEditBoxHelper.mCocos2dxActivity.getResources().getDisplayMetrics();
                        editBox.setTextSize(2, fontSize / displayMetrics0.density);
                    }
                    editBox.setTypeface(tf);
                }
            }
        });
    }

    public static void setFontColor(int index, int red, int green, int blue, int alpha) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setTextColor(Color.argb(alpha, red, green, blue));
                }
            }
        });
    }

    public static void setInputFlag(int index, int inputFlag) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setInputFlag(inputFlag);
                }
            }
        });
    }

    public static void setInputMode(int index, int inputMode) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setInputMode(inputMode);
                }
            }
        });
    }

    public static void setMaxLength(int index, int maxLength) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setMaxLength(maxLength);
                }
            }
        });
    }

    public static void setPlaceHolderText(int index, String text) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setHint(text);
                }
            }
        });
    }

    public static void setPlaceHolderTextColor(int index, int red, int green, int blue, int alpha) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setHintTextColor(Color.argb(alpha, red, green, blue));
                }
            }
        });
    }

    public static void setReturnType(int index, int returnType) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setReturnType(returnType);
                }
            }
        });
    }

    public static void setText(int index, String text) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setText(text);
                }
            }
        });
    }

    public static void setVisible(int index, boolean visible) {
        Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxEditBox editBox = (Cocos2dxEditBox)Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
                if(editBox != null) {
                    editBox.setVisibility((visible ? 0 : 8));
                    if(visible) {
                        editBox.requestFocus();
                        Cocos2dxEditBoxHelper.openKeyboard(index);
                        return;
                    }
                    Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().requestFocus();
                    Cocos2dxEditBoxHelper.closeKeyboard(index);
                }
            }
        });
    }
}

