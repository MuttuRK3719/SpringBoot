package com.abhishekverma.service;

import com.abhishekverma.exception.OwnerNotFoundException;

public interface OwnerService {
    String findOwner() throws OwnerNotFoundException;

    void setId(int id);
}
