package com.umeng.common.message;

import android.content.Context;
import java.lang.reflect.Field;

public class c
{
  private static final String a = c.class.getName();
  private static c b;
  private static Class d = null;
  private static Class e = null;
  private static Class f = null;
  private static Class g = null;
  private static Class h = null;
  private static Class i = null;
  private static Class j = null;
  private static Class k = null;
  private Context c;

  private c(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    try
    {
      e = Class.forName(this.c.getPackageName() + ".R$drawable");
    }
    catch (ClassNotFoundException paramContext)
    {
      try
      {
        f = Class.forName(this.c.getPackageName() + ".R$layout");
      }
      catch (ClassNotFoundException paramContext)
      {
        try
        {
          d = Class.forName(this.c.getPackageName() + ".R$id");
        }
        catch (ClassNotFoundException paramContext)
        {
          try
          {
            g = Class.forName(this.c.getPackageName() + ".R$anim");
          }
          catch (ClassNotFoundException paramContext)
          {
            try
            {
              h = Class.forName(this.c.getPackageName() + ".R$style");
            }
            catch (ClassNotFoundException paramContext)
            {
              try
              {
                i = Class.forName(this.c.getPackageName() + ".R$string");
              }
              catch (ClassNotFoundException paramContext)
              {
                try
                {
                  j = Class.forName(this.c.getPackageName() + ".R$array");
                }
                catch (ClassNotFoundException paramContext)
                {
                  try
                  {
                    while (true)
                    {
                      k = Class.forName(this.c.getPackageName() + ".R$raw");
                      return;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                      continue;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                      continue;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                      continue;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                      continue;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                      continue;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                      continue;
                      paramContext = paramContext;
                      Log.b(a, paramContext.getMessage());
                    }
                  }
                  catch (ClassNotFoundException paramContext)
                  {
                    Log.b(a, paramContext.getMessage());
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private int a(Class<?> paramClass, String paramString)
  {
    if (paramClass == null)
    {
      Log.b(a, "getRes(null," + paramString + ")");
      throw new IllegalArgumentException("ResClass is not initialized. Please make sure you have added neccessary resources. Also make sure you have " + this.c.getPackageName() + ".R$* configured in obfuscation. field=" + paramString);
    }
    try
    {
      int m = paramClass.getField(paramString).getInt(paramString);
      return m;
    }
    catch (Exception localException)
    {
      Log.b(a, "getRes(" + paramClass.getName() + ", " + paramString + ")");
      Log.b(a, "Error getting resource. Make sure you have copied all resources (res/) from SDK to your project. ");
      Log.b(a, localException.getMessage());
    }
    return -1;
  }

  public static c a(Context paramContext)
  {
    if (b == null)
      b = new c(paramContext);
    return b;
  }

  public int a(String paramString)
  {
    return a(g, paramString);
  }

  public int b(String paramString)
  {
    return a(d, paramString);
  }

  public int c(String paramString)
  {
    return a(e, paramString);
  }

  public int d(String paramString)
  {
    return a(f, paramString);
  }

  public int e(String paramString)
  {
    return a(h, paramString);
  }

  public int f(String paramString)
  {
    return a(i, paramString);
  }

  public int g(String paramString)
  {
    return a(j, paramString);
  }

  public int h(String paramString)
  {
    return a(k, paramString);
  }
}

/* Location:           C:\Users\User\dex2jar-2.0\dex\qting\classes-dex2jar.jar
 * Qualified Name:     com.umeng.common.message.c
 * JD-Core Version:    0.6.2
 */