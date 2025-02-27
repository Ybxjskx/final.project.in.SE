package org.example.finalproject1.bl;

import org.example.finalproject1.DAL.*;

import java.util.List;

public class AdminBL {
    private final MenuRepository menuRepository;
    private final RequestsRepository requestsRepository;
    private final UsersRepository usersRepository;
    public AdminBL(MenuRepository menuRepository, RequestsRepository requestsRepository, UsersRepository usersRepository) {
        this.menuRepository = menuRepository;
        this.requestsRepository = requestsRepository;
        this.usersRepository = usersRepository;
    }
    public void deleteMenuItem(int menuId, int userId) {
        User user = usersRepository.FindUser(userId);

        if (!user.isAdmin()) {
            return;
        }

        MenuItem menuItem = menuRepository.findMenuItem(menuId);
        menuItem.disable();
        menuRepository.UpsertMenuItem(menuItem);
    }
    public List<MenuItem> getAllMenuItems() {
        return menuRepository.FindMenuItems(true);
    }
    public List<Request> getRequests() {
        return requestsRepository.FindRequests();
    }
    public void markRequestAsApproved(int menu_id, int UserId) {
        Request request = requestsRepository.FindRequest(menu_id);
        request.approve();
        requestsRepository.UpsertRequest(request);
    }
    public void markRequestAsRejected(int menu_id, int UserId) {
        Request request = requestsRepository.FindRequest(menu_id);
        request.reject();
        requestsRepository.UpsertRequest(request);
    }
}
