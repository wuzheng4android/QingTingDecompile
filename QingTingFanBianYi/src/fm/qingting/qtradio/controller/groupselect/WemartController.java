package fm.qingting.qtradio.controller.groupselect;

import android.content.Context;
import fm.qingting.framework.controller.ViewController;
import fm.qingting.framework.event.IEventHandler;
import fm.qingting.framework.manager.EventDispacthManager;
import fm.qingting.framework.model.INavigationBarListener;
import fm.qingting.framework.model.NavigationBarItem;
import fm.qingting.framework.view.IView;
import fm.qingting.qtradio.controller.ControllerManager;
import fm.qingting.qtradio.fm.WebViewPlayer;
import fm.qingting.qtradio.model.ActivityNode;
import fm.qingting.qtradio.view.groupselect.WemartWebView;
import fm.qingting.qtradio.view.navigation.NavigationBarView;
import fm.qingting.utils.QTMSGManage;

public class WemartController extends ViewController
  implements IEventHandler, INavigationBarListener
{
  private NavigationBarView barTopView;
  private ActivityNode mNode = null;
  private WemartWebView mWemartWebView;

  public WemartController(Context paramContext, IView paramIView, ActivityNode paramActivityNode)
  {
    super(paramContext, paramIView);
    this.controllerName = "wemart";
    this.barTopView = new NavigationBarView(paramContext);
    this.barTopView.setLeftItem(0);
    if ((paramActivityNode != null) && (paramActivityNode.hasShared))
      this.barTopView.setRightItem("分享");
    String str = paramActivityNode.name;
    paramContext = str;
    if (str != null)
    {
      paramContext = str;
      if (str.length() > 10)
      {
        paramContext = str.substring(0, 10);
        paramContext = paramContext + "...";
      }
    }
    this.barTopView.setTitleItem(new NavigationBarItem(paramContext));
    this.barTopView.setBarListener(this);
    this.mNode = paramActivityNode;
    setNavigationBar(this.barTopView);
    this.mWemartWebView = ((WemartWebView)paramIView);
  }

  public void config(String paramString, Object paramObject)
  {
    if (paramString.equalsIgnoreCase("setTitle"));
  }

  public void controllerDidPopped()
  {
    super.controllerDidPopped();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onEvent(Object paramObject1, String paramString, Object paramObject2)
  {
  }

  public void onItemClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2:
    case 3:
    }
    do
    {
      return;
      if ((this.mWemartWebView != null) && (this.mWemartWebView.canBack()))
      {
        this.mWemartWebView.goBack();
        return;
      }
      ControllerManager.getInstance().popLastController();
      return;
    }
    while ((this.mNode == null) || (!this.mNode.hasShared));
    QTMSGManage.getInstance().sendStatistcsMessage("shareActivity", this.mNode.name);
    EventDispacthManager.getInstance().dispatchAction("shareChoose", this.mNode);
    WebViewPlayer.getInstance().callback();
  }

  public void viewWillClose(IView paramIView)
  {
  }
}

/* Location:           C:\Users\User\dex2jar-2.0\dex\qting\classes-dex2jar.jar
 * Qualified Name:     fm.qingting.qtradio.controller.groupselect.WemartController
 * JD-Core Version:    0.6.2
 */