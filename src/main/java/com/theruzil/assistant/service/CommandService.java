package com.theruzil.assistant.service;

import com.theruzil.assistant.domain.BaseCommand;

public interface CommandService {
    String giveCommand(BaseCommand command);
}
