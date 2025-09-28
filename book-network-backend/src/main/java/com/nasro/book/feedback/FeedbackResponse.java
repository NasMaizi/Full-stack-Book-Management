package com.nasro.book.feedback;

import lombok.Builder;

@Builder
public record FeedbackResponse(
        double note,
        String comment,
        boolean ownFeedback
) {
}
