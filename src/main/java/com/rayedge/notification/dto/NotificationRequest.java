package com.rayedge.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {  // e.g. customer email/phone
    private String message;     // e.g. booking confirmation
}
