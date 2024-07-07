package com.example.solid.ocp.voilation

class NotificationService {

    fun sendNotification(notification: Notification) {
        when (notification) {
            Notification.PUSH_NOTIFICATION -> {
                // send push notification
            }

            Notification.EMAIL -> {
                // send email notification
            }
            Notification.SMS ->{
                //send sms
            }
        }
    }
}