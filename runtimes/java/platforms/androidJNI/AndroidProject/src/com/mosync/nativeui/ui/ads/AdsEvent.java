package com.mosync.nativeui.ui.ads;

/**
 * Event sent by a banner widget.
 * @author emma tresanszki
 */
public class AdsEvent
{
	// Banner's handle that sends the event.
	public int mBannerHandle;
	// One of the #MA_ADS_EVENT constants.
	public int mBannerEventType;
	// If bannerEventType is #MA_ADS_EVENT_FAILED this code will describe the error.
	public int mErrCode;

	public AdsEvent(int type, int handle, int errorCode)
	{
		this.mBannerEventType = type;
		this.mBannerHandle = handle;
		this.mErrCode = errorCode;
	}

	@Override
	public String toString()
	{
		// Print error message.
		if ( this.mErrCode < 0 )
			return "Ad " + mBannerHandle + " event: " + mBannerEventType + ". Error code: " + mErrCode;

		return "Ad " + mBannerHandle + " event: " + mBannerEventType;
	}
}