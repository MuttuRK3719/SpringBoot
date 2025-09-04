package com.abhishekverma.repository;

import com.abhishekverma.exception.OwnerNotFoundException;

public interface OwnerRepository {
    String findOwner(int ownerId) throws OwnerNotFoundException;
}